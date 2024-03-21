public class TeamWork06 {

    // # 6
    //
    // Написать метод, который принимает на вход предложение и считает количество слов в предложении
    //
    //Для проверки работы алгоритма второму человеку написать следующий селениум тест:

    //	- зайти на сайт https://citaty.info/topic/zhizn/short

    //- считать цитату “Иногда хватает мгновения, чтобы забыть жизнь, а иногда не хватает жизни,
    // чтобы забыть мгновение.”
    //- С помощью алгоритма первого человека подсчитать количество слов в actualResult
    //- подтвердить, что в цитате содержится 14 слов

    public static int getWordsAmount(String text){

        return text.split(" ").length;
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split(" ");
        return words.length;
    }

    public static void main(String[] args) {

//        String text = "Иногда хватает мгновения, чтобы забыть жизнь," +
//                " а иногда не хватает жизни, чтобы забыть мгновение.";
//
//        System.out.println(getWordsAmount(text));

        String sentence = "Иногда хватает мгновения, чтобы забыть жизнь, а иногда не хватает жизни, чтобы забыть мгновение.";
        int wordCount = countWords(sentence);
        System.out.println(wordCount);

    }
}
