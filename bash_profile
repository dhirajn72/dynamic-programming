# export PATH="$PATH:/Users/dhiraj/softwares/gradle-5.6.4/bin"
# export SCRIPT_HOME=/Users/dhiraj/Documents/office/DNS/codechanges/helloworld.sh
TERRAFORM_HOME=/Users/dhiraj/oracle/softwares/
GO_HOME=/Users/dhiraj/oracle/softwares/go/bin
ANT_HOME_BIN=/Users/dhiraj/oracle/softwares/apache-ant-1.7.1/bin
ANT_HOME=/Users/dhiraj/oracle/softwares/apache-ant-1.7.1
MAVEN_HOME=/Users/dhiraj/oracle/softwares/apache-maven-3.5.4/bin
# This java home has been set for ant not to fail, actual java home is
# /System/Library/Frameworks/JavaVM.framework/Versions/Current/Commands
# which is symlinked from /usr/bin/java
#Don't set JAVA_HOME anywhere else, it fails the  compliance.
#export JAVA_HOME=/usr

export PATH="$PATH:$TERRAFORM_HOME:$GO_HOME:$MAVEN_HOME"










#complete -C /Users/dhiraj/softwares/terraform terraform
#export PS1='\u@\H [\w]$ '

#PS1="\a\n\n\e[31;1m\u@\h on \d at \@\n\e[33;1m\w\e[0m\n$ "
#export PS1="\e[33;1m\u@\h \e[33;1m\w\e[0m\n$ "

#RED command line $
#export PS1="\[\033[01;35m\]\u\[\033[01;30m\]@\[\033[01;31m\]\h\[\033[00m\]:\e[33;1m\w\e[0m\n\[\033[01;31m\]:~$ \[\033[00m\]"

#Yellow command line $
#export PS1="\[\033[01;35m\]\u\[\033[01;30m\]@\[\033[01;31m\]\h\[\033[00m\]:\e[33;9m\w\e[0m\n\[\033[33;9m\]:~$ \[\033[00m\]"


export PS1="\[\033[01;35m\]\u\[\033[01;30m\]@\[\033[01;31m\]\h\[\033[00m\]:\e[30;7m\w\e[0m\n\[\033[30;9m\]:~$ \[\033[00m\]"

#When executing interactively, bash displays the primary prompt PS1 when it is ready to read a command, and the secondary prompt PS2 when it needs more input to complete a command.  Bash allows these prompt strings  to  be  customized  by
#   inserting a number of backslash-escaped special characters that are decoded as follows:
#          \a     an ASCII bell character (07)
#          \d     the date in "Weekday Month Date" format (e.g., "Tue May 26")
#          \D{format}
#                 the format is passed to strftime(3) and the result is inserted into the prompt string; an empty format results in a locale-specific time representation.  The braces are required
#          \e     an ASCII escape character (033)
#          \h     the hostname up to the first `.'
#          \H     the hostname
#          \j     the number of jobs currently managed by the shell
#          \l     the basename of the shell's terminal device name
#          \n     newline
#          \r     carriage return
#          \s     the name of the shell, the basename of $0 (the portion following the final slash)
#          \t     the current time in 24-hour HH:MM:SS format
#          \T     the current time in 12-hour HH:MM:SS format
#          \@     the current time in 12-hour am/pm format
#          \A     the current time in 24-hour HH:MM format
#          \u     the username of the current user
#          \v     the version of bash (e.g., 2.00)
#          \V     the release of bash, version + patch level (e.g., 2.00.0)
#          \w     the current working directory, with $HOME abbreviated with a tilde
#          \W     the basename of the current working directory, with $HOME abbreviated with a tilde
#          \!     the history number of this command
#          \#     the command number of this command
#          \$     if the effective UID is 0, a #, otherwise a $
#          \nnn   the character corresponding to the octal number nnn
#          \\     a backslash
#          \[     begin a sequence of non-printing characters, which could be used to embed a terminal control sequence into the prompt
#          \]     end a sequence of non-printing characters

echo > ~/.bash_history
