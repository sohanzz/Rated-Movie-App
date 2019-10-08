package com.asifahmedsohan.rated;


import java.util.List;

public interface OnGetReviewsCallback {
    void onSuccess(List<Review> reviews);

    void onError();
}
