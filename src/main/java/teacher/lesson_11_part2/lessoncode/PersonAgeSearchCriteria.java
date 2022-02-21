package teacher.lesson_11_part2.lessoncode;

class PersonAgeSearchCriteria implements SearchCriteria {

    private final int ageToSearch;

    PersonAgeSearchCriteria(int ageToSearch) {
        this.ageToSearch = ageToSearch;
    }

    @Override
    public boolean match(Person person) {
        int personAge = person.getAge();
        if (personAge == ageToSearch) {
            return true;
        } else {
            return false;
        }
    }
}
