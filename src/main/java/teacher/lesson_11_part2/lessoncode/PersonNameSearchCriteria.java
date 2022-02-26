package teacher.lesson_11_part2.lessoncode;

class PersonNameSearchCriteria implements SearchCriteria {

    private final String nameToSearch;

    PersonNameSearchCriteria(String nameToSearch) {
        this.nameToSearch = nameToSearch;
    }

    @Override
    public boolean match(Person person) {
        String personName = person.getName();
        if (nameToSearch.equals(personName)) {
            return true;
        } else {
            return false;
        }
    }
}
