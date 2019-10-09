package com.asifahmedsohan.rated.Callback;


import com.asifahmedsohan.rated.Model.Review;

import java.util.List;

public interface OnGetReviewsCallback {
    void onSuccess(List<Review> reviews);

    void onError();
}
