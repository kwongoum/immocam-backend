package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Subscription;
import be.wkam.immocam.services.IGenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SubscriptionController {

    private IGenericService<Subscription,Long> subscriptionService;

    @RequestMapping(name = "/subscription", method = RequestMethod.POST )
 public  Subscription saveSubscription( Subscription subscription){
       return subscriptionService.save(subscription);
  }

    //  a modifier
       @RequestMapping(value = "/subscriptions/id", method = RequestMethod.GET)
     public Subscription getSubscription(Long id){
         return subscriptionService.get(id);
    }
      @RequestMapping(value= "/subscriptions", method = RequestMethod.GET)
         public Collection<Subscription> listSubscription(){
          return subscriptionService.list();
         }


}
