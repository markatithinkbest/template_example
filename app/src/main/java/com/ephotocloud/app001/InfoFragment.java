package com.ephotocloud.app001;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.myapps.materialapplication.R;

/**
 * Created by poliveira on 11/03/2015.
 */
public class InfoFragment extends Fragment {
//    public static final String TAG = "intro";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //      Adjust img size to fit screen
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        int width = display.getWidth();
        int height =width*200/300;// standard img size should be 300x200
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        iv.setLayoutParams(parms);
        
        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ephotocloud.com/";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        List<String> content = new ArrayList<>();
//        content.add("list");
//        content.add("list");
//        content.add("list");
//        content.add("list");
//        content.add("list");
//        content.add("list");
//        content.add("list");
//        ListView listView = (ListView) getActivity().findViewById(R.id.listView);
//        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, content));
        //  Button btn1=(Button)findV
    }
}
