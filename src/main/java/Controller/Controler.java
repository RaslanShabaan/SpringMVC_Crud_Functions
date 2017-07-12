package Controller;

import Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
public class Controler {

    public List<User> g;

    @Autowired(required = true)
    @Qualifier("userService")
    Service.UserDaoService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
public ModelAndView Home()
{
    ModelAndView modelAndView=new ModelAndView("Index");
    return modelAndView;
}

    @RequestMapping(value = "/Insert",method = RequestMethod.POST)
    public ModelAndView Insert(@RequestParam("Id")int Id,@RequestParam("Name")String Name,@RequestParam("Pass")String Pass
    )
    {

        User user = new User();
        user.setId(Id);
        user.setUserName(Name);
        user.setUserPass(Pass);
        // insert object into db bu user service
        userService.Insert(user);


        ModelAndView modelAndView=new ModelAndView("Index");
        return modelAndView;
    }


    @RequestMapping(value = "/Delete",method = RequestMethod.POST)
    public ModelAndView Delete(@RequestParam("Id")int Id )
    {

        // Delete object into db bu user service
        userService.Delete(Id);

        ModelAndView modelAndView=new ModelAndView("Index");
        return modelAndView;
    }


    @RequestMapping(value = "/Update",method = RequestMethod.POST)
    public ModelAndView Update(@RequestParam("Id")int Id,@RequestParam("Name")String Name,@RequestParam("Pass")String Pass
    )
    {

        User user = new User();
        user.setId(Id);
        user.setUserName(Name);
        user.setUserPass(Pass);

        // update object into db bu user service
        userService.Update(user);


        ModelAndView modelAndView=new ModelAndView("Index");
        return modelAndView;
    }


    @RequestMapping(value = "/Select",method = RequestMethod.POST)
    public ModelAndView Select(@RequestParam("Id")int Id )
    {

        User d=new User();
        // Select object into db bu user service
      d=  userService.Select(Id);

        System.out.println(d.getId() +" ***** " + d.getUserName() +" ****** " +d.getUserPass());

        ModelAndView modelAndView=new ModelAndView("Index");
        return modelAndView;
    }

    @RequestMapping(value = "/SelectAll",method = RequestMethod.POST)
    public ModelAndView SelectAll()
    {
        ArrayList<String> A=new ArrayList<String>();
        ModelAndView modelAndView=new ModelAndView("Index");

        List<User> gg=new ArrayList<User>();
        gg = userService.SelectAllUsers();

for(int c=0;c<gg.size();c++)
{
    User d=new User();
    d=gg.get(c);

    
    A.add(d.getUserName());
    A.add(d.getUserPass());

}
        System.out.println(A);
        return modelAndView;
    }

}

