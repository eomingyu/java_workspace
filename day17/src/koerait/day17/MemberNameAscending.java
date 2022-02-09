package koerait.day17;

import java.util.Comparator;

public class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
