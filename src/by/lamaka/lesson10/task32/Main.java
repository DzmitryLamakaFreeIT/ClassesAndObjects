package by.lamaka.lesson10.task32;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*Имеется текст. Следует составить для него частотный словарь.*/
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Время течёт удивительно быстро. Казалось, совсем недавно было солнечное утро, но вот ты смотришь на часы - а там уже день." +
                " За окном барабанит дождь, настроение падает и кажется, что всё валится из рук. К вечеру ты ужасно устаёшь," +
                " хочешь отдохнуть всего пару минут, но за окном уже тёмная ночь." +
                " К твоему удивлению, внутри уже кипит энергия, и ты совершенно не хочешь спать, занимая себя ненужными вещами.");
        Map<String,Integer> result = getFrequencyLettersForText(stringBuilder.toString());
        System.out.println(result);
    }

    public static String[] parser(StringBuilder stringBuilder) {
        String splitter = "\\s?[-\\s.!,?]\\s?";
        String[] result = stringBuilder.toString().split(splitter);
        return result;
    }

    public static Map<String,Integer> getFrequencyLettersForText(String text){
        Pattern pattern;
        Matcher matcher;
        int counter = 0;
        Map<String,Integer> result = new LinkedHashMap<>();

        for (char ch = 'а'; ch <= 'я'; ch++) {
            counter = 0;
            pattern = Pattern.compile(String.valueOf(ch));
            matcher = pattern.matcher(text);
            while(matcher.find()){
                counter++;
            }
            result.put(String.valueOf(ch),counter);
        }
        return  result;
    }
}
