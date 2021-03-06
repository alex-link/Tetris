package domain;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.awt.*;
import java.util.List;

/**
 * User: alexander.lenkevich
 * Date: 1/10/12
 * Time: 6:19 PM
 */
public enum FigureType {
    I {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(0, 1, 0),
                    new Point(0, 2, 0),
                    new Point(0, 3, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.RED;
        }

        @Override
        public Point getRightBottomCorner() {
            return new Point(0, 3, 0);
        }
    }, J {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(2, 0, 0),
                    new Point(2, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.YELLOW;
        }
    }, L {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(2, 0, 0),
                    new Point(0, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.MAGENTA;
        }
    },
    O {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(0, 1, 0),
                    new Point(1, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.BLUE;
        }

        @Override
        public Point getRightBottomCorner() {
            return new Point(1, 1, 0);
        }
    }, S {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(1, 0, 0),
                    new Point(2, 0, 0),
                    new Point(0, 1, 0),
                    new Point(1, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.CYAN;
        }
    }, T {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(2, 0, 0),
                    new Point(1, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.GREEN;
        }
    }, Z {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(1, 1, 0),
                    new Point(2, 1, 0)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.ORANGE;
        }
    }, Z3 {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(1, 0, 0),
                    new Point(1, 0, 1),
                    new Point(1, 1, 1)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.PINK;
        }

        @Override
        public Point getRightBottomCorner() {
            return new Point(1, 1, 1);
        }

    }, S3 {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(
                    new Point(0, 0, 0),
                    new Point(0, 1, 0),
                    new Point(0, 1, 1),
                    new Point(1, 1, 1)
            );
        }

        @Override
        public Color getDefaultColor() {
            return Color.CYAN;
        }

        @Override
        public Point getRightBottomCorner() {
            return new Point(1, 1, 1);
        }

    }, P {
        @Override
        public ImmutableSet<Point> getPoints() {
            return ImmutableSet.of(new Point(0, 0, 0));
        }

        @Override
        public Color getDefaultColor() {
            return Color.BLACK;
        }
    };

    public abstract ImmutableSet<Point> getPoints();

    public abstract Color getDefaultColor();

    public Point getRightBottomCorner() {
        return new Point(2, 1, 0);
    }

    public static List<FigureType> getFiguresToGen2D() {
        return ImmutableList.of(I, J, L, O, S, T, Z);
    }

    public static List<FigureType> getFiguresToGen3D() {
        return ImmutableList.of(I, J, L, O, S, T, Z, Z3, S3);
    }
}
