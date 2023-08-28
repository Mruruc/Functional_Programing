package com.mruruc.optionals;

import java.util.Optional;

public class Intro_Optional {

    /**
     * Background:
     * Before Java 8 introduced the Optional class, developers had to deal with null values,
     * which, if not handled correctly, could lead to runtime exceptions, particularly the dreaded NullPointerException (NPE).
     *
     * Purpose of Optional:
     * Optional was introduced to represent the idea of computation that might fail.
     * Instead of returning null for an uncertain result, methods could now return an instance of Optional.
     * This helps in explicitly showing when a method can produce a non-value,
     * making code more readable and reducing the chances of unexpected NPEs.
     */


    public static void main(String[] args) {
        try {

            Service service = new Service();
            User userById = service.findUserById(1);

            System.out.println(userById.name());

            Optional<User> byId = service.findById(2);
            User user = byId.get();
            System.out.println(user.name());

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }



}


class Service{
    public User findUserById(Integer id){
        if (id == 1) {
            return new User(1, "John");
        }
        throw new NullPointerException();
    }

    public Optional<User> findById(Integer id){
        if (id == 1) {
            return Optional.of(new User(1, "John"));
        }
      else {
            return  Optional.empty();
        }
    }


}
record User(Integer id,String name){}