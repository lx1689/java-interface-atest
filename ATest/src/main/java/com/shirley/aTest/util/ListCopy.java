package com.shirley.aTest.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
* @Description: TODO(这里用一句话描述这个类的作用)
*/
public class ListCopy {
	public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {  
	    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
	    ObjectOutputStream out = new ObjectOutputStream(byteOut);
	    out.writeObject(src);
	      
	    ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
	    ObjectInputStream in = new ObjectInputStream(byteIn);
	    
	    @SuppressWarnings("unchecked")
	    List<T> dest = (List<T>) in.readObject();  
	    return dest;  
	}  
}
