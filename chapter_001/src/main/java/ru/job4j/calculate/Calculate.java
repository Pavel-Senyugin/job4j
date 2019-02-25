package ru.job4j.colculate;

/**
  * Class Calculate решение задачи части 001 урок 1.3.
  *@author senyugin
  *@since 25.02.2019
*/  

public class Calculate{
/**
*метод для тестирования.
*@param value строка для вывода в консоль.
*@return String value.
*/	
	
public String echo(String value){
	   return String.format("%s %s %s", value, value, value);
}
public static void main (String[] args){
	   Calculate calc = new Calculate();
	   System.out.println(calc.echo("aah"));
	
	}	
	
}

