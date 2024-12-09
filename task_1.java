@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
   assertEquals("Ошибка: метод должен вернуть true для возраста 19", true, isAdult);
}
