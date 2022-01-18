package me.relex.circleindicator.CircleIndicator;

public class ViewPager {
    androidx.viewpager.widget.ViewPager viewpager = (androidx.viewpager.widget.ViewPager) view.findViewById(R.id.viewpager);
    viewpager.setAdapter(adapter);

    ViewPager indicator = (ViewPager) view.findViewById(R.id.indicator);
    indicator.setViewPager(viewpager);

    // optional
    adapter.registerDataSetObserver(indicator.getDataSetObserver());
}
