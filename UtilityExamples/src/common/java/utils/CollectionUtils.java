package common.java.utils;

import java.util.Collection;

public class CollectionUtils {
	public static boolean isNotEmpty(@SuppressWarnings("rawtypes") Collection collection) {
		return (collection != null && !collection.isEmpty());
	}
}
