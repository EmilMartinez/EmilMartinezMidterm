package datastructure;


import parser.Student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;

import static databases.ConnectToSqlDB.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> englishCities = new ArrayList<String>();
		englishCities.add("Manchester");
		englishCities.add("London");
		englishCities.add("New Castle");
		englishCities.add("Greenwich");
		englishCities.add("Waterloo");

		List<String> germanCities = new ArrayList<String>();
		germanCities.add("Berlin");
		germanCities.add("Munich");
		germanCities.add("Hamburg");
		germanCities.add("Frankfurt");
		germanCities.add("Bonn");

		List<String> frenchCities = new ArrayList<String>();
		frenchCities.add("Paris");
		frenchCities.add("Normandy");
		frenchCities.add("Cannes");
		frenchCities.add("Lyon");
		frenchCities.add("Bordeaux");

		List<String> italianCities = new ArrayList<String>();
		italianCities.add("Florance");
		italianCities.add("Rome");
		italianCities.add("Venice");
		italianCities.add("Verona");
		italianCities.add("Trieste");

		Map<String, List<String>> countriesEurope = new LinkedHashMap<String,List<String>>();
		countriesEurope.put("England", englishCities);
        countriesEurope.put("Germany", germanCities);
        countriesEurope.put("France", frenchCities);
        countriesEurope.put("Italy", italianCities);

        for (Map.Entry<String, List<String>> Euro : countriesEurope.entrySet())
		System.out.println("Euro:" + Euro.getKey()+ "| cities: " + Euro.getValue());
			}
		}








