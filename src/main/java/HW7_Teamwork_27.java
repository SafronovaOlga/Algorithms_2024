import java.util.HashSet;
import java.util.Set;

public class HW7_Teamwork_27 {
    
    
    

    //    Написать метод, который принимает на вход текст  и возвращает количество уникальных слов в тексте
//    Для проверки результата
//    подготовить expected результат с помощью алгоритма другого человека
//    зайти на сайт https://planetcalc.ru/3204/
//    ввести текст “это мой дом не твой дом”
//    нажать кнопку Рассчитать
//    считать результат
//    подтвердить, что в тексте содержится 5 уникальных слов
    
    

    public static int getUniqueWordsAmount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Set<String> uniqueWords = new HashSet<>();

        for (String word : text.split(" ")) {
            uniqueWords.add(word);
        }

        return uniqueWords.size();
    }

    public static void main(String[] args) {
        String text = "это мой дом не твой дом не твой";

        System.out.println(getUniqueWordsAmount(text));

//        StringBuffer sb = new StringBuffer("Hello");
//        sb.reverse();
//        System.out.println(sb);
    }

}
