package common.java.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.java.model.Person;

public class MapUtils {

	HashMap<String, List<Person>> personMap = new HashMap<>();

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		MapUtils mapUtils = new MapUtils();
		Person person = new Person();
		int count = 3;
		for (int i = 0; i < count; i++) {
			personList = person.createPersonList(String.valueOf(i));
			mapUtils.addCloudObjectToMap(personList);
		}
		mapUtils.printMap(mapUtils.personMap);

	}

	private void addCloudObjectToMap(List<Person> personList) {

		if (CollectionUtils.isNotEmpty(personList)) {
			for (Person person : personList) {
				String wardNo = person.getWardNo();
				if (!personMap.containsKey(wardNo)) {
					personMap.put(wardNo, new ArrayList<>(Arrays.asList(person)));
				} else {
					// https://stackoverflow.com/questions/19398004/arraylist-addall-method-throwing-exception
					personMap.get(wardNo).addAll(new ArrayList<>(Arrays.asList(person)));

				}

			}

		}
	}

	private void printMap(Map<String, List<Person>> personMap) {
		for (Map.Entry<String, List<Person>> entry : personMap.entrySet()) {
			System.out.println("Ward number is:\n " + entry.getKey() + "\n" + "PersonList is "
					+ entry.getValue().toString() + "\n");
		}

	}
}
