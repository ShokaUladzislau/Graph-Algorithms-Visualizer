import java.awt.*;

public final class Edge {
  private final String from;
  private final String to;
  private final int weight;

  public Edge(String from, String to, int weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public int getWeight() {
    return weight;
  }

  public Point getMidPoint(Point from, Point to) {
    int x = (int) ((from.getX() + to.getX()) / 2);
    int y = (int) ((from.getY() + to.getY()) / 2);
    return new Point(x, y);
  }
}
