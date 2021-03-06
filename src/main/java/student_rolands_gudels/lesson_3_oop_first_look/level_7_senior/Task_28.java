package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Task_28 {
    /*Topic: Environment variable JAVA_HOME.

JAVA_HOME is an operating system (OS) environment variable
which can optionally be set after either the Java Development Kit (JDK)
or the Java Runtime Environment (JRE) is installed.
The JAVA_HOME environment variable points to the file system
location where the JDK or JRE was installed.

This variable should be configured on all OS's that have
a Java installation, including Windows, Ubuntu, Linux, Mac and Android.

The JAVA_HOME environment variable is not actually used by the
locally installed Java runtime. Instead, other programs installed
on a desktop computer that require a Java runtime will query the
OS for the JAVA_HOME variable to find out where the runtime is installed.
After the location of the JDK or JRE installation is found,
those programs can initiate Java-based processes,
start Java virtual machines and use command line utilities
such as the Java archive utility or the Java compiler,
both of which are packaged inside the Java installation's \bin directory.


How to set JAVA_HOME on Windows.

A user can set JAVA_HOME on Windows through the administrative
option in the "Edit System Variables" window.
With the environment variables editor, a user can add
a new system variable named JAVA_HOME and assign it the
value of the location of the JDK install directory.

How to find JAVA_HOME on Windows.

It is important for a user to easily find the JAVA_HOME
value and verify that it is set properly. One way to
find JAVA_HOME is to open the environment variable editor
and view its assigned value. Another option is to echo
JAVA_HOME in a command window.

MacOS and Linux-Specific Ways to find JAVA_HOME.

If we're using either macOS or Linux,
we can open up our terminal and type:

echo $JAVA_HOME

If JAVA_HOME is defined in our environment,
then the above command will print it out.

Or, we could try:  which java

Which probably just shows us /usr/bin/java.

But, really this isn't very helpful since it's a symbolic link.
To unravel this, we'll use dirname and readlink;

for Linux:  dirname $(dirname $(readlink -f $(which javac)))

and for macOS: $(dirname $(readlink $(which javac)))/java_home

As a result, this command prints the currently used java folder.


Common JAVA_HOME errors.

If any program that requires a Java runtime fails to find
the JAVA_HOME environment variable upon startup,
or if the JAVA_HOME environment variable is misconfigured,
it will result in some of the following error messages to be displayed:

- A Java installation exists but JAVA_HOME has been set incorrectly.
- JAVA_HOME is set to an invalid directory.
- JAVA_HOME is not defined correctly.
- JAVA_HOME environment variable is not set.
- JAVA_HOME command not found.
- JAVA_HOME not found in your environment.
- JAVA_HOME does not point to the JDK.

Most of these problems can be addressed once the user confirms
that the JAVA_HOME variable has indeed been set up and that
the variable has been assigned the correct value.


JAVA_HOME vs PATH Variable.

Along with the configuration of JAVA_HOME,
it is also useful to simultaneously update
the operating system's PATH variable.
With the PATH, the Java installation's
\bin directory is added, which makes all
of the various Java utilities packaged in
a JDK or JRE available from anywhere on the command line.
As a result, if a program cannot locate the JAVA_HOME variable,
it may still be able to access Java runtime tools by looking at
which utilities have been made available through the PATH.*/

  //Done  C:\Users\darba>where java
 //C:\Program Files\Eclipse Foundation\jdk-16.0.2.7-hotspot\bin\java.exe
 //
 //C:\Users\darba>java -version
 //openjdk version "16.0.2" 2021-07-20
 //OpenJDK Runtime Environment Temurin-16.0.2+7 (build 16.0.2+7)
 //OpenJDK 64-Bit Server VM Temurin-16.0.2+7 (build 16.0.2+7, mixed mode, sharing)

}
