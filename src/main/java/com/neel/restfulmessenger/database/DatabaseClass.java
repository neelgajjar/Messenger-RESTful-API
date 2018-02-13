package com.neel.restfulmessenger.database;

import com.neel.restfulmessenger.model.Message;
import com.neel.restfulmessenger.model.Profile;

import java.util.HashMap;
import java.util.Map;


// Made public and static so that any class in the app has access to these resources
// Is a JDBC or Hibernate class to connect to the the DB
public class DatabaseClass {

  private static Map<String, Profile> idProfileMap = new HashMap<String, Profile>();
  private static Map<Long, Message> idMessageMap = new HashMap<Long, Message>();

  public static Map<String, Profile> getIdProfileMap() {
    return idProfileMap;
  }

  public static Map<Long, Message> getIdMessageMap() {
    return idMessageMap;
  }
}
