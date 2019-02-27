package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class famousService 
{
    
    //private RestTemplate restTemplateWithUserAgent;
    private RestTemplate restTemplate = new RestTemplate();
    
    public List getTinyList()
    {
         String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
        List<> tiny = restTemplate.getForObject(url, tiny);
        return tiny;
    }
    
    /*public String getRandomQuote()
    {
        //Step 1: URL
        String url = "http://gturnquist-quoters.cfapps.io/api/random";
        //Step 2: Request
        QuoteResponse response = restTemplate.getForObject(url,  QuoteResponse.class);      
        //Step 3: Pick data we need     
        return response.getValue().getQuote();
    }*/

}
