interface Demo{
	static void fun(){	//public static void fun()
		System.out.println("In fun Demo");

	}

	default void gun(){	//public default void gun()
		System.out.println("In gun Demo");
	}
}
