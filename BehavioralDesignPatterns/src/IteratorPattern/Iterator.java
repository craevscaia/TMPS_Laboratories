package IteratorPattern;

import MediatorPattern.Student;
import MediatorPattern.StudentChat;

import java.util.List;

public class Iterator implements IIterator{
        private StudentEnum studentName;
        private List<Student> studentsList;
        private int position;

        public Iterator(StudentEnum studentName, List<Student> studentsList) {
            this.studentName = studentName;
            this.studentsList = studentsList;
        }

        @Override
        public boolean hasNext() {
            while (position < studentsList.size()) {
                Student st = studentsList.get(position);
                if (st.equals(studentName) || studentName.equals(studentsList)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Student next() {
            Student st = studentsList.get(position);
            position++;
            return st;
        }


}

