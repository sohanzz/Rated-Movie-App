package com.asifahmedsohan.rated;


import java.util.List;

public interface OnGetTrailersCallback {
    void onSuccess(List<Trailer> trailers);

    void onError();
}
