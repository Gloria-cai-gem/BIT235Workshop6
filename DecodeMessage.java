// DecodeMessage.java
// Exercise 4: decode a coded message using the substitution table.
// The plain alphabet is matched position-by-position with the cipher row:
// a->c, b->r, c->g, d->z, e->a, f->v, g->i, h->b, i->s, j->d,
// k->o, l->e, m->q, n->f, o->h, p->u, q->j, r->x, s->k, t->l,
// u->w, v->m, w->y, x->n, y->p, z->t.
// To decode, look the coded letter up in the plain row and output the
// matching cipher-row letter. The message can be changed easily by
// changing the value of "coded".
public class DecodeMessage {
    public static void main(String[] args) {
        String coded = "G tgsl Qefe.";
        System.out.println("Coded:   " + coded);
        System.out.println("Decoded: " + decode(coded));
    }

    public static String decode(String message) {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "crgzavibsdoeqfhujxklwmynpt";
        StringBuilder decoded = new StringBuilder();

        for (char ch : message.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            int index = plain.indexOf(lower);
            if (index >= 0) {
                char out = cipher.charAt(index);
                if (Character.isUpperCase(ch)) {
                    out = Character.toUpperCase(out);
                }
                decoded.append(out);
            } else {
                // spaces and punctuation are left unchanged
                decoded.append(ch);
            }
        }
        return decoded.toString();
    }
}
