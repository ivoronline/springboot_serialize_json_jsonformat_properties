package com.ivoronline.springboot_serialize_json_jsonformat_properties.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class PersonDTO {

  //PROPERTIES
  @JsonFormat(pattern="dd.MM.yyyy") //Define date format used by JSON Property: dd.MM.yyyy  25.02.2021
  public LocalDate birthday;        //It gets converted to LocalDate format:    yyyy-MM-dd  2021-02-25
  public String    name;

}
