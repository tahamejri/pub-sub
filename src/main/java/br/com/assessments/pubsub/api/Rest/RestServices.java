package br.com.assessments.pubsub.api.Rest;

import br.com.assessments.pubsub.Events.Event1;
import br.com.assessments.pubsub.Events.Event2;
import br.com.assessments.pubsub.core.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.function.Consumer;

@RestController
@RequestMapping("/")
public class RestServices {
    Publisher publisher = Publisher.getInstance();

    Consumer<Event1> consumer1 = x->{
        System.out.println("hello x responding to Event1");
    };

    Consumer<Event2> consumer2 = x->{
        System.out.println("hello x responding to Event2");
    };


    @GetMapping()
    public ResponseEntity<?> subscribe(){
        publisher.subscribe(Event1.class,consumer1);
        publisher.subscribe(Event2.class,consumer2);
        return ResponseEntity.ok("subscriber succesefully");
    }


    @PostMapping()
    public ResponseEntity<?> execute(){
        publisher.publish(new Event1("hello event 1"));
        publisher.publish(new Event2("hello event 2"));
        publisher.unsubscribe(Event2.class,);
        return ResponseEntity.ok("executed");
    }
}
