package co.grandcircus.famouslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.famousInfo;


@Controller
public class famousController 
{
    @Autowired
    private famousService famousService;
    
    @RequestMapping("/index")
    public ModelAndView showTiny()
    {
        famousInfo.tiny = famousService.getTinyList();
        return new ModelAndView("index", "tiny", showTiny() );
    }
    
    @RequestMapping("/complete")
    public ModelAndView complete()
    {
        
        return new ModelAndView("complete");
    }
    
    /*@Autowired
    private ApiService apiService;
    
    @RequestMapping("/quote")
    public ModelAndView showQuote() 
    {
        String quote = apiService.getRandomQuote();
        return new ModelAndView("quote", "quote", quote);
    }*/
}
