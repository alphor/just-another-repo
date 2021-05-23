package io.ajarara.jmh;

import io.ajarara.Prufer;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Arrays;
import java.util.Collections;

public class PruferBenchmark {

    @Benchmark
    public void pruferOfSimpleTree() {
        Prufer.of(Arrays.asList(
                0, 5, 12, 20, 17,
                14, 11, 20, 8, 13,
                22, 14, 14, 0, 15,
                14, 1, 17, 24, 16,
                19, 19, 22, 16, 0
        ));
    }

    @Benchmark
    public void pruferOfLargeTree() {
        Prufer.of(Arrays.asList(
                37, 387, 127, 298, 217, 240, 308, 446, 79, 391, 223, 124, 495, 105, 26, 87, 156, 200, 454, 461, 238, 457, 506, 176, 36,
                149, 276, 227, 220, 38, 59, 500, 428, 255, 436, 288, 231, 516, 90, 493, 21, 16, 515, 355, 285, 24, 64, 132, 136, 437,
                195, 443, 383, 296, 219, 155, 331, 330, 162, 285, 359, 140, 515, 513, 363, 466, 138, 368, 495, 221, 346, 24, 90, 473, 430,
                111, 519, 144, 489, 128, 412, 421, 301, 90, 275, 192, 273, 141, 494, 258, 403, 200, 290, 174, 377, 108, 37, 11, 224, 273,
                496, 504, 184, 108, 331, 133, 55, 457, 77, 38, 24, 268, 176, 318, 236, 330, 417, 309, 61, 162, 112, 367, 512, 189, 227,
                502, 180, 244, 319, 439, 471, 367, 372, 499, 434, 5, 50, 347, 125, 404, 393, 407, 19, 361, 100, 467, 336, 205, 474, 267,
                353, 266, 300, 230, 124, 343, 62, 454, 354, 261, 354, 377, 513, 219, 186, 108, 475, 452, 98, 459, 362, 446, 348, 158, 314,
                523, 39, 63, 227, 147, 5, 164, 198, 511, 120, 403, 248, 252, 127, 355, 283, 408, 220, 405, 226, 100, 145, 415, 45, 90,
                239, 401, 323, 266, 98, 127, 417, 68, 114, 198, 448, 376, 290, 443, 456, 270, 46, 497, 220, 398, 3, 26, 171, 460, 152,
                198, 28, 156, 95, 367, 369, 123, 295, 273, 99, 175, 10, 168, 470, 234, 24, 306, 411, 297, 454, 523, 184, 293, 274, 335,
                214, 265, 151, 432, 456, 166, 328, 507, 256, 338, 437, 165, 478, 470, 380, 519, 29, 306, 141, 99, 502, 365, 370, 38, 497,
                54, 202, 202, 221, 250, 135, 108, 309, 92, 16, 332, 473, 413, 397, 146, 1, 4, 349, 35, 487, 88, 18, 308, 188, 499,
                127, 232, 261, 444, 277, 345, 183, 67, 475, 452, 204, 24, 60, 187, 468, 6, 91, 120, 24, 359, 100, 6, 114, 459, 188,
                59, 443, 266, 349, 96, 38, 41, 458, 387, 6, 501, 5, 103, 154, 200, 514, 140, 367, 338, 196, 430, 517, 89, 169, 509,
                173, 215, 522, 316, 501, 367, 470, 134, 348, 450, 149, 241, 484, 289, 274, 517, 239, 469, 70, 150, 250, 322, 31, 7, 517,
                173, 356, 482, 153, 150, 208, 394, 35, 387, 40, 474, 415, 10, 524, 149, 522, 244, 62, 372, 208, 81, 259, 303, 92, 63,
                386, 328, 239, 497, 314, 319, 346, 337, 432, 27, 206, 65, 365, 279, 250, 209, 356, 150, 347, 332, 265, 309, 436, 294, 186,
                260, 149, 432, 238, 464, 63, 128, 197, 215, 213, 0, 510, 492, 197, 62, 259, 416, 417, 423, 213, 215, 520, 167, 315, 62,
                13, 426, 483, 22, 307, 239, 453, 328, 480, 458, 400, 214, 477, 26, 6, 10, 288, 149, 401, 155, 357, 341, 289, 186, 246,
                420, 70, 40, 58, 92, 428, 32, 280, 235, 81, 323, 504, 299, 429, 189, 55, 240, 198, 47, 218, 498, 8, 230, 466, 107,
                281, 240, 214, 24, 390, 326, 229, 188, 38, 267, 472, 405, 513, 389, 331, 452, 264, 247, 416, 510, 198, 301, 305, 468, 370));
    }
}
