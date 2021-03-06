package example.android.custom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> tittlefm = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public Fragment getItem(int position) {
     return this.fragmentList.get(position);

    }


    @Override
    public int getCount() {
        return this.fragmentList.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tittlefm.get(position);
    }
    public  void AddFragment(Fragment fragment,String tittle)
    {
        fragmentList.add(fragment);
        tittlefm.add(tittle);
    }

}
