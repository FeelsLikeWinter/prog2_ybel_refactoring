package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @Test
    void testGetPrice() {
        EBike eBike = new EBike("eSchnell", 400.99, 25, 3, 7, 2500);
        Article article = new Article(eBike, 3);
        assertEquals(article.getPrice(), 962.3760000000001);
    }
}
