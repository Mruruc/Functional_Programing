package com.mruruc.lambda.supplier;
/* used in case of:
 * no argument and returning any kind of data type.
 */


import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnection());
        System.out.println(getDBConnectionSupplier.get());
    }

    static Supplier<List<String>> getDBConnectionSupplier=
            ()-> List.of(
                    "jdbc://localhost:5466/postgresql/db",
                    "jdbc://localhost:5466/mysql/db"
            );
    static List<String> getDBConnection(){
        return List.of(
                "jdbc://localhost:5466/postgresql/db",
                "jdbc://localhost:5466/mysql/db"
        );
    }
}
