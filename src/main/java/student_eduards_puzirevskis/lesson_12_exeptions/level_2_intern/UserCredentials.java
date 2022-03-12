package student_eduards_puzirevskis.lesson_12_exeptions.level_2_intern;

import java.util.List;

class UserCredentials {

  private List<Role> roles;

 public UserCredentials(List<Role> roles) {
  this.roles = roles;
 }

 public List<Role> getRoles() {
  return roles;
 }

 public boolean hasRole(Role role) {
  return roles.contains(role);
 }

}
