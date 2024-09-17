import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        // Class Reflection
        Class<?> eagleClass = Eagle.class; // Use a generic type for type safety

        System.out.println("Class name: " + eagleClass.getName());
        System.out.println("Class modifiers: " + Modifier.toString(eagleClass.getModifiers()));

        // Method Reflection
        Method[] methods = eagleClass.getDeclaredMethods(); // Get only methods declared in the Eagle class

        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Method return type: " + method.getReturnType());
            System.out.println("Class name: " + method.getDeclaringClass());
            System.out.println("******************");
        }

        System.out.println("Field Reflection below");

        // Field Reflection
        Field[] fields = eagleClass.getFields(); //Gives only public type field
        //Field[] fields = eagleClass.getDeclaredFields(); // Get all fields declared in the Eagle class

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("****************************");
        }
    }
}
