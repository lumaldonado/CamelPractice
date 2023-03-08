package org.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:///temp/camel")
                .log("${headers}")
                .log("${body}")
                .to("file:///temp/camel/processed")
        ;
    }
}
