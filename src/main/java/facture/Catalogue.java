package facture;

import java.util.Map;
import java.util.HashMap;

public class Catalogue {
    
    private Map<String,Article> articleChoisi = new HashMap<>();
    
    public void addArticle(Article article) {
         String code_article = article.getCode();
         articleChoisi.put(code_article, article);
    }
    
    public Article findByCode(String code) {
         return articleChoisi.get(code);
    }   
}
