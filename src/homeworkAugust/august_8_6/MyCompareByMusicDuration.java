package homeworkAugust.august_8_6;

import java.util.Comparator;

public class MyCompareByMusicDuration implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getDuration().compareTo(o2.getDuration());
	}

}
