package day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class DemoReflection {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, SecurityException, InstantiationException {
		Student s = new Student();

		Class k = Class.forName("day12.Student");
		Field[] fields = k.getDeclaredFields();
		for (Field f : fields) {
			Type type = f.getGenericType();
			System.out.println(type.getTypeName());
			System.out.println(f.getName());

		}

		for (Field f : fields) {
			f.setAccessible(true);
			if (f.getName().equals("rollno"))
				f.setInt(s, 10);
			if (f.getName().equals("name"))
				f.set(s, "abc");

		}
		System.out.println(s);

		System.out.println("--------------------------------------------");

		Method[] methods = k.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			if (method.getName().equals("simplemethod")) {
				method.invoke(s);

			}
			if (method.getName().equals("parammethod")) {
				Type[] types = method.getGenericParameterTypes();
				System.out.println(Arrays.toString(types));
				method.invoke(s, 23, "kkk");

			}
			if (method.getName().equals("privatemethod")) {
				method.setAccessible(true);
				method.invoke(s);

			}
			if (method.getName().equals("staticmethod")) {
				method.setAccessible(true);
				method.invoke(null);

			}

		}

		Constructor<Student>[] cons = k.getDeclaredConstructors();
		for (Constructor<Student> con : cons) {
			if (con.getParameterCount() == 2) {
				Student ss = con.newInstance(12, "sss");
				System.out.println(ss);
			}
		}
		for (Method method : methods) {
			if (method.getDeclaredAnnotation(CreatedBy.class) != null) {
				CreatedBy myanno = method.getAnnotation(CreatedBy.class);
				System.out.println(myanno.name());
				System.out.println(myanno.priority());
				if (myanno.priority() == 1) {
					method.invoke(s, 34, "ppp");
				}
			}
		}

	}

}