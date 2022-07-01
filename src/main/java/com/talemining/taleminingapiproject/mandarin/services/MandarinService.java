package com.talemining.taleminingapiproject.mandarin.services;

import io.github.yizhiru.thulac4j.POSTagger;
import io.github.yizhiru.thulac4j.Segmenter;
import io.github.yizhiru.thulac4j.term.TokenItem;

import java.io.IOException;
import java.util.List;

public class MandarinService {

    public String wordSplit(String inputText) throws IOException {

        String sentence = "滔滔的流水，向着波士顿湾无声逝去";
        String sentenceTrad = "滔滔的流水，向著波士頓灣無聲逝去";
        List<String> words = Segmenter.segment(sentence);
        Segmenter.enableConvertToSimplifiedCHN();
        List<String> words2 = Segmenter.segment(sentenceTrad); //virker ikke
// [滔滔, 的, 流水, ，, 向着, 波士顿湾, 无声, 逝去]


        return inputText;
    }

}
