package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.HHStrategy;
import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.MoikrugStrategy;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.view.HtmlView;
import com.javarush.task.task28.task2810.view.View;

import java.io.IOException;


public class Aggregator {

    public static void main(String[] args) {
        /*
        * 3.1. Создай вью, модель, контроллер.
3.2. Засэть во вью контроллер.
3.3. Вызови у вью метод userCitySelectEmulationMethod.
        * */

        HtmlView view = new HtmlView();
        Provider hhProvider = new Provider(new HHStrategy());
        Provider moiKrugProvider = new Provider(new MoikrugStrategy());
        Model model = new Model(view, hhProvider, moiKrugProvider);
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod ();

    }
}
