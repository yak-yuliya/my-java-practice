package lambdaAgain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExpectsConsumer {
public void doSomething(){

       List<String> ingredients = Arrays.asList("salt", "flour", "eggs", "butter", "milk", "baling powder");
        for(
    String ingredient :ingredients)

    {
        if (ingredient.contains("eggs")) {
            System.out.println(ingredient);
        }
    }
ingredients.forEach(new Consumer<String>() {
    @Override
    public void accept(String s) {
        System.out.println(ingredients);
    }
});





}
}
