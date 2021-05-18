package com.terbac.parallax.wallpaper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Objects;

/**
 * Developed by: BdFreak777
 */
@SuppressLint("UseCompatLoadingForDrawables")
public class LiveWallpaperAboutFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow));
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Objects.requireNonNull(getActivity()).onBackPressed();
            }
        });

        TextView textViewAbout = view.findViewById(R.id.textView);
        SpannableString spannableString = new SpannableString(Html.fromHtml(getResources()
                .getString(R.string.about)));
        textViewAbout.setText(spannableString);

        textViewAbout.setMovementMethod(new LinkMovementMethod());
        return view;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
    }
}
