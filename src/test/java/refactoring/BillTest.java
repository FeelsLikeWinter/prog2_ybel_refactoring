package refactoring;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    @Test
    void testAddArticle() {
        Bill bill = new Bill("Fred", "Freddy", "Sesamstrasse", "42",
            36340, new Date(), "fred@net.de", "Bremen");
        EBike eBike = new EBike("eSchnell", 400.99, 25, 3, 7, 2500);
        Article article = new Article(eBike, 3);
        assertTrue(bill.addArticle(article));
    }

    @Test
    void testGetDetails() {
        Bill bill = new Bill("Fred", "Freddy", "Sesamstrasse", "42",
            36340, new Date(), "fred@net.de", "Bremen");
        EBike eBike = new EBike("eSchnell", 400.99, 25, 3, 7, 2500);
        Article article = new Article(eBike, 3);
        bill.addArticle(article);
        assertEquals(bill.getDetails(), "Details for \"Fred\"\n" +
            "Sesamstrasse 42\n" +
            "36340 Bremen\n" +
            "Geburtstag: Thu Jun 19 23:28:46 CEST 2025\n" +
            "Email: fred@net.de\n" +
            "\n" +
            "refactoring.Article: \n" +
            "\teSchnell\tx\t3\t=\t962.3760000000001\n" +
            "\n" +
            "Total price:\t962.3760000000001");
    }
}
