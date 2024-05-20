package com.acciojob.BookMyShowMAY.Controller;

import com.acciojob.BookMyShowMAY.Requests.AddShowRequest;
import com.acciojob.BookMyShowMAY.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("show")
public class ShowController {
    @Autowired
    private ShowService showService;

    public ResponseEntity addShow(@RequestBody AddShowRequest showRequest){
        String response= showService.addShow(showRequest);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
