package com.example.studiomcgee


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticleAdapter(getArticles())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
    fun getArticles(): List<Article>{
        return listOf(
            Article(
                R.drawable.blog13,
                "30 December — Design Inspiration",
                "Mixing Modern and Vintage Decor",
                "How to blend different styles for a unique look.",
                "One of the hottest trends in interior design is mixing modern and vintage decor to create a space that feels both timeless and fresh. In this article, we share tips on how to combine these two styles seamlessly, whether it’s through furniture, lighting, or accessories.\n" +
                        "Learn how to strike the perfect balance between old and new, and create a home that reflects your unique taste."
            ),
            Article(
                R.drawable.blog12,
                "25 December — DIY",
                "Creating Your Own Statement Wall",
                "Add personality to your space with a feature wall.",
                "A statement wall is a perfect way to showcase your style and add interest to a room. In this DIY guide, we’ll show you how to create a feature wall using paint, wallpaper, or even wood paneling. It’s an easy project that can completely change the feel of your space.\n" +
                        "Whether you’re going for a bold color or a textured look, this project will give your room the wow factor you’re looking for."
            ),
            Article(
                R.drawable.blog15,
                "20 December — How-To",
                "Organizing Your Closet Like a Pro",
                "Get your wardrobe in order with these expert tips.",
                "A well-organized closet can make a world of difference in your daily routine. In this article, we share step-by-step tips on how to declutter, categorize, and maximize your closet space. Whether you have a small wardrobe or a walk-in closet, these strategies will help you create a system that works for you.\n" +
                        "From storage solutions to styling tips, you’ll be able to turn your closet into a more functional and visually pleasing space."
            ),
            Article(
                R.drawable.blog11,
                "22 December — Design Trends",
                "Bold Wallpaper Ideas for Every Room",
                "Make a statement with eye-catching wallpaper designs.",
                "Wallpaper is making a big comeback in interior design, and it’s not just for the walls! In this article, we explore bold wallpaper trends that can transform any room, from the living room to the bathroom. Whether you prefer floral prints, geometric patterns, or something more abstract, there’s a wallpaper design that will elevate your space.\n" +
                        "We also share tips on how to use wallpaper in unexpected ways, like on ceilings or in small accent areas, to create a striking visual effect."
            ),

            Article(
                R.drawable.blog1,
                "04 October — Read, How-To",
                "Restyling Your Shelves With Shea",
                "Tip for creating a space that feels uniquely yours.",
                "Styling your shelves is an art that evolves over time. With over a decade of experience, Shea has refined the process of making shelves not only functional but also a reflection of your personal style. Whether you are starting with a blank canvas or giving an existing shelf a facelift, the approach is always to make the space feel like home. Shelves should tell your story—whether through books, memorabilia, or artwork.\n" +
                        "In this article, Shea explores new ideas inspired by McGee & Co's latest collection. From choosing statement pieces to layering objects of different heights, every detail matters. She emphasizes the importance of incorporating pieces that have personal significance, like souvenirs from travels or family heirlooms.\n" +
                        "Shea also discusses the use of color and texture to create visual interest. A mix of matte and glossy finishes can add depth, while a pop of color in an unexpected place can elevate the look. The key is balance—too much of one thing can overwhelm the space, but a harmonious mix creates a curated yet lived-in feel.\n" +
                        "No shelf is complete without a bit of greenery. Plants breathe life into a space and bring a touch of nature indoors. Shea suggests mixing potted plants with smaller accessories to add softness and warmth to your shelves. It's a subtle way to make the space feel fresh and alive.\n" +
                        "As you experiment with your shelf styling, don't be afraid to move things around. Sometimes, the best arrangements come from trial and error. And remember, your shelves are an evolving story. Let them grow and change with you over time."
            ),
            Article(
                R.drawable.blog2,
                "10 October — Design Inspiration",
                "Creating a Cozy Bedroom Retreat",
                "Turn your bedroom into a peaceful haven.",
                "A cozy bedroom is more than just a place to sleep—it's a sanctuary where you can unwind and recharge. Shea McGee's approach to bedroom design revolves around creating a space that feels warm, inviting, and distinctly yours. The secret lies in layering textures, incorporating soft materials, and personalizing the decor.\n" +
                        "Start with the basics: plush bedding, a comfortable mattress, and a mix of soft pillows. From there, build the coziness with layered blankets and throws. Opt for natural fabrics like cotton or linen for a breathable, comfortable feel that invites relaxation.\n" +
                        "Next, consider the lighting. Warm, ambient light can set the mood for a cozy retreat. Use lamps with dimmers to create soft, glowing light that complements the rest of the decor. Don’t forget to add candles or string lights for a touch of romance.\n" +
                        "Personalize the room with decor that speaks to you. Family photos, artwork, or items collected from your travels add character and warmth. These personal touches make the space uniquely yours and bring comfort beyond the aesthetics.\n" +
                        "Finally, don't overlook the floor. A plush rug underfoot can add another layer of coziness, making the room feel inviting from top to bottom. With these simple additions, your bedroom will transform into the perfect retreat after a long day."
            ),
            Article(
                R.drawable.blog3,
                "15 October — DIY",
                "How to Paint Your Own Wall Art",
                "Simple steps to create custom artwork.",
                "Painting your own wall art might sound daunting, but with a few simple techniques, you can create stunning pieces that perfectly match your style. This DIY project is ideal for anyone looking to add a personal touch to their home without breaking the bank. Plus, it's a fun way to unleash your inner artist!\n" +
                        "Start by gathering your materials: a canvas, paints in colors that complement your decor, and brushes of varying sizes. If you're a beginner, don't worry about perfecting your technique—abstract designs or simple patterns can have a big impact without requiring advanced skills.\n" +
                        "When choosing your color palette, consider the room's existing decor. For a cohesive look, pick shades that either match or contrast with your furniture and accessories. Bold, contrasting colors can make a statement, while softer, muted tones can create a calming atmosphere.\n" +
                        "To add texture to your artwork, experiment with different brush strokes or mix mediums. Adding layers of paint can create depth and interest, and incorporating unexpected materials like sand or fabric can give your piece a unique twist.\n" +
                        "Once your artwork is complete, don’t forget to frame it! A simple frame can elevate your painting and make it look professionally done. And most importantly, have fun with the process—your artwork should be a reflection of your creativity and style."
            ),
            Article(
                R.drawable.blog4,
                "02 December — Home Decor",
                "Styling Open Shelving in the Kitchen",
                "Display and organize your kitchen essentials.",
                "Open shelving in the kitchen has become a popular trend, allowing for both functional storage and stylish displays. In this article, we share tips on how to style your shelves with a mix of practical items like dishes and pantry staples, alongside decorative pieces such as vases or plants. The key is to balance aesthetics with functionality.\n" +
                        "Learn how to create a cohesive look by using a consistent color palette and choosing items that reflect your personal style. With the right approach, your kitchen can be both organized and visually appealing!"
            ),
            Article(
                R.drawable.blog5,
                "05 December — Design Inspiration",
                "Bringing Nature Indoors",
                "Incorporate natural elements into your home decor.",
                "There's something about the beauty of nature that brings peace and tranquility into any space. This article explores various ways to introduce natural elements into your home, whether through houseplants, organic textures, or earthy color schemes. From wooden furniture to botanical prints, discover how nature-inspired decor can transform your interior.\n" +
                        "We also share tips on how to maintain balance and avoid overwhelming your space with too many natural elements, ensuring a harmonious and calming environment."
            ),
            Article(
                R.drawable.blog6,
                "08 December — Holiday Decor",
                "Creating a Festive Outdoor Display",
                "Transform your yard with holiday lights and decorations.",
                "Your outdoor space deserves just as much holiday cheer as your indoor decor. In this article, we explore creative ways to make your yard festive and welcoming during the holiday season. From string lights to outdoor ornaments, we'll show you how to create a magical display that impresses guests and passersby.\n" +
                        "Whether you're going for a classic look or something more contemporary, you'll find plenty of ideas to make your outdoor holiday decor stand out!"
            ),
            Article(
                R.drawable.blog7,
                "10 December — How-To",
                "Updating Your Bathroom on a Budget",
                "Simple ways to give your bathroom a fresh look.",
                "A bathroom renovation doesn’t have to be costly. This guide offers budget-friendly solutions to update your bathroom, from refreshing fixtures to adding new accessories. A coat of paint, updated lighting, or even changing the hardware can make a big difference without breaking the bank.\n" +
                        "Discover easy ways to transform your bathroom into a more stylish and functional space, with tips that suit any budget."
            ),
            Article(
                R.drawable.blog14,
                "15 December — DIY",
                "Crafting Your Own Holiday Wreath",
                "A step-by-step guide to making a custom wreath.",
                "Add a personal touch to your holiday decor by crafting your own wreath. In this DIY project, we'll guide you through the process of creating a beautiful holiday wreath using fresh greenery, ornaments, and ribbons. It’s a simple yet fun project that allows for plenty of creativity and customization.\n" +
                        "Not only will you have a unique decoration for your home, but you’ll also have the satisfaction of knowing you made it yourself!"
            ),
            Article(
                R.drawable.blog9,
                "18 December — Outdoor Living",
                "Setting Up a Year-Round Patio",
                "Create an outdoor space you can enjoy in any season.",
                "Your patio can be a year-round retreat with the right setup. In this article, we provide tips for making your outdoor space usable during all seasons, from cozy fire pits for the winter months to shade solutions for the summer heat. With some thoughtful planning, your patio can be a comfortable place to relax, entertain, or dine no matter the weather.\n" +
                        "Learn how to select the best furniture and accessories for durability and style, ensuring your outdoor area is both practical and inviting all year long."
            ),

        )
    }
}