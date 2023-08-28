package com.mruruc.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional_Methods {
    public static void main(String[] args) {


        /**
         * Optional.of(value)
         *  Creates an Optional object that contains a non-null value.
         */

        Optional<String> johnDoe = Optional.of("John Doe");
        System.out.println(johnDoe);

        // Optional<String> testNullAble = Optional.of(null);
        //   System.out.println(testNullAble); -->> if object is empty will throw NullPointerException

        /**
         * Optional.ofNullable(value)
         * if passed object not null it will Creates an Optional object that might contain a value, or it will return Optional.empty.
         */

        Optional<Post> post = Optional.ofNullable(new Post(500));
        System.out.println(post);


        String greet = null;
        System.out.println(Optional.ofNullable(greet));


        /**
         * Optional.empty()
         * is a static method that returns an empty Optional instance. An empty Optional represents a case where there's no value present.
         * Return Value for Absence: When you have a method that might not return a value, you can use Optional as its return type.
         * If there's no value to return, you can return
         */
        Optional<String> wafloo = findNickName("Wafloo");
        String nickName = wafloo.get();
        System.out.println(nickName);

        /**
         *  isPresent();
         *  if value is present return true else false
         */

        Optional<Post> post1 = createPost(12);
        System.out.println(
                post1.isPresent() ? post1.get().likes() : Optional.empty()
        );


        /**
         * orElse(defaultValue):
         *
         * This method returns the value if it's present in the Optional. If the Optional is empty, it returns the defaultValue you provided.
         */

        Optional<String> opt = Optional.of("Java");
        String result = opt.orElse("UNKNOWN");
        System.out.println(result);

        String fawLang = null;
        Optional<String> opt2 = Optional.ofNullable(fawLang);
        String result2 = opt2.orElse("UNKNOWN");
        System.out.println(result2);


        /**
         * instead of providing a default value directly, you provide a Supplier function that produces the default value.
         * This can be useful when computing the default value is expensive and you want to avoid it unless absolutely necessary.
         */
        Supplier < Double > defaultValue = () -> Math.random();
        System.out.println(
                Optional.ofNullable(null).orElseGet(defaultValue)
        );



        /**
         * Handling absent values with exceptions:
         * Sometimes, you don't just want a default value.
         * You'd rather throw an exception when an expected value is absent. Optional provides a couple of ways to do this:
         */

        /**
         * orElseThrow():
         *
         * Throws a NoSuchElementException if the Optional is empty. Otherwise, it returns the value present inside the Optional.
         */

      //  Optional.ofNullable(null).orElseThrow();


         /**
         * orElseThrow(exceptionSupplier)
         * with that we can throw our custom  exception!!!!!!!!!!!!!
         */ ;
         try {
            Optional<String> stringOptional= Optional.ofNullable(null);
             stringOptional.orElseThrow(() -> new CustomException("NULL VALUE!"));
         }
         catch (CustomException ex){
             System.out.println(ex.getMessage());
         }


        /**
         * ifPresentOrElse(consumer, runnable):
         * Introduced in Java 9, this method is an extension of ifPresent(). It allows you to provide two actions:
         *
         * A Consumer action to be executed if the Optional contains a value.
         * A Runnable action to be executed if the Optional is empty.
         */

        Optional.ofNullable(null).
                ifPresentOrElse(System.out::println,()-> new CustomException("Using ifPresentOrElse method I liked this method"));

    }

    public static Optional<String> findNickName(String realName) {
        if (realName.equals("Wafloo")) {
            return Optional.of("wofilooo");
        } else {
            return Optional.empty();
        }
    }

    private static Optional<Post> createPost(Integer likes) {
        return Optional.of(new Post(likes));
    }
}

record Post(Integer likes) {
}
