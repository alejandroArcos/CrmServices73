package com.tokio.crm.crmservices73.Util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListUtil {

    public static <T> Predicate<T> distinctByKey(
	    Function<? super T, ?> keyExtractor) {	 
	    Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
	    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null; 
	}
    
}
