package demo.com.demodeploy.controller;

import demo.com.demodeploy.dto.TimeStampResponse;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class controllerApi {

    @GetMapping
    public ResponseEntity<TimeStampResponse> horarioAtual () {
        return ResponseEntity.ok(new TimeStampResponse(Instant.now()));
    }
}
