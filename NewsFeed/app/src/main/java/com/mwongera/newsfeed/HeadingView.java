package com.mwongera.newsfeed;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.Collapse;
import com.mindorks.placeholderview.annotations.expand.Expand;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;
import com.mindorks.placeholderview.annotations.expand.Toggle;

@Parent
@SingleTop
@Layout(R.layout.feed_heading)

public class HeadingView {
    @View(R.id.headingTxt)
    private TextView headingTxt;

    @View(R.id.toggleIcon)
    private ImageView toggleIcon;

    @Toggle(R.id.toggleView)
    private LinearLayout toggleView;

    @ParentPosition
    private int mParentPosition;

    private Context mContext;
    private String mHeading;

    public HeadingView(Context context, String heading) {
        mContext = context;
        mHeading = heading;
    }

    @Resolve
    private void onResolved() {
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.round_expand_less_black_18dp));
        headingTxt.setText(mHeading);
    }

    @Expand
    private void onExpand(){
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.round_expand_more_black_18dp));
    }

    @Collapse
    private void onCollapse(){
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.round_expand_less_black_18dp));
    }
}

/*
@Parent is annotation used to bind a class as the parent view.

@layout is used to bind the layout with this class

@SingleTop is used to keep only one parent in expanded sate and others in collapsed state

@View is used to bind the views in a layout we want to refer to

@Toggle is used to provide a view in the layout to be used as a toggle for expanding
or collapsing a parent on view click.If not provided then the parent view is used as
a toggle view by default

@ParentPosition is used bind an int variable to be updated with the relative
position of a parent with respect to other parents

@Expand is used to get a method invoked when the parent view expands

@Collapse is used to get a method when the parent view collapses

 */