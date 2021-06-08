package com.ivoronline.springboot_serialize_json_jsonformat_properties.controllers;

import com.ivoronline.springboot_serialize_json_jsonformat_properties.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO          = new PersonDTO();
              personDTO.birthday = LocalDate.now();
              personDTO.name     = "John";

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}
