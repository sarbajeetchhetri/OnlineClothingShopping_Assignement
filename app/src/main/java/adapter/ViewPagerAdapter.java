package adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> fragmentTitle = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public CharSequence getPageTitle(int position){
        return fragmentTitle.get(position);
    }
    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        fragmentTitle.add(title);
    }
}
